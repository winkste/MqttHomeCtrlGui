/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.ui.RectangleEdge;

/**
 *
 * @author winkste
 */
public class MySensorPanel {
    
    ChartPanel chartPanel;

    public JPanel getPanel() {
        return (chartPanel);
    }

    /**
     * Series 1.
     */
    private TimeSeries series1;

    /**
     * Series 2.
     */
    private TimeSeries series2;

    /**
     * Creates a new self-contained demo panel.
     */
    public MySensorPanel(String header_str) {
        //super(new BorderLayout());
        this.series1 = new TimeSeries("Temperature");
        this.series2 = new TimeSeries("Humidity");
        TimeSeriesCollection dataset1 = new TimeSeriesCollection(
                this.series1);
        TimeSeriesCollection dataset2 = new TimeSeriesCollection(
                this.series2);
        
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
                header_str, "Time", "°C", dataset1,
                true, true, false);
        chart.setTitle((String)null);
        
        LegendTitle legend = chart.getLegend();
        legend.setPosition(RectangleEdge.RIGHT);
        
        /*this.addChart(chart);*/

        XYPlot plot = (XYPlot) chart.getPlot();
        ValueAxis axis = plot.getDomainAxis();
        axis.setAutoRange(true);
        axis.setFixedAutoRange(1000.0 * 60 * 60 /* 24*/);  // 24 hrs

        plot.setDataset(1, dataset2);
        NumberAxis rangeAxis2 = new NumberAxis("%");
        rangeAxis2.setAutoRangeIncludesZero(false);
        plot.setRenderer(1, new DefaultXYItemRenderer());
        plot.setRangeAxis(1, rangeAxis2);
        plot.mapDatasetToRangeAxis(1, 1);

        ChartUtilities.applyCurrentTheme(chart);
        plot.setBackgroundPaint(Color.DARK_GRAY);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        chartPanel = new ChartPanel(chart);
    }

    public DataSetCallB getTempSetCallback() {
        return (new DataSetCallB() {
            @Override
            public void setData(double data_d) {
                Millisecond now = new Millisecond();
                //System.out.println("Now1 = " + now.toString());
                series1.add(new Millisecond(), data_d);
            }
        });
    }

    public DataSetCallB getHumSetCallback() {
        return (new DataSetCallB() {
            @Override
            public void setData(double data_d) {
                Millisecond now = new Millisecond();
                //System.out.println("Now2 = " + now.toString());
                series2.add(new Millisecond(), data_d);
            }
        });
    }
}
