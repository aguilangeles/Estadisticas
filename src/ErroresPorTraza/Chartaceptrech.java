/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Chartaceptrech extends JPanel {

    public Chartaceptrech() {
    }

    public ChartPanel getChartPanel(String chartTitle, JTable table) {

        PieDataset dataset = creaDataset(table);
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(450, 354));
        chartPanel.setMouseWheelEnabled(true);
        return chartPanel;

    }

    private PieDataset creaDataset(JTable table) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int row = 0; row < table.getRowCount(); row++) {
            String nombre = (String) table.getValueAt(row, 0);
            int cantidad = (int) table.getValueAt(row, 1);
            dataset.setValue(nombre, cantidad);

        }
        return dataset;
    }

    private JFreeChart createChart(PieDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);
//                createBarChart(title, "Cantidades", "Estado de las trazas", dataset, PlotOrientation.VERTICAL, true, true, false);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("no data");
        plot.setCircular(false);
        plot.setLabelGap(0.08);
        return chart;
    }
}
