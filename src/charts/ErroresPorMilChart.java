/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charts;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class ErroresPorMilChart extends JPanel {

    public ErroresPorMilChart() {
    }

    public ChartPanel getChartPanel(String chartTitle, JTable table) {

        DefaultCategoryDataset dataset = createDataset(table);
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(450, 440));
        chartPanel.setMouseWheelEnabled(true);
        return chartPanel;

    }

    private DefaultCategoryDataset createDataset(JTable table) {
        DefaultCategoryDataset result = new DefaultCategoryDataset();

        for (int row = 0; row < table.getRowCount(); row++) {
            String name = (String) table.getValueAt(row, 0);
            double quantity = (double) table.getValueAt(row, 1);
            result.setValue(quantity, name, "");
        }
        return result;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createBarChart(title, "Tipo de Control", "Cantidad de Imagenes", dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        CategoryAxis xAxis = (CategoryAxis) plot.getDomainAxis();
        xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45); // Inclinamos 45 grados las etiquetas del eje X
        plot.setBackgroundAlpha(0.5f);
        return chart;
    }
}
