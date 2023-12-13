package Decorator;

import Model.IGraph;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;

public class AxisTitleGraphDecorator extends GraphDecorator {

    public AxisTitleGraphDecorator(IGraph graph) {
        super(graph);
    }

    @Override
    public JFreeChart showChart() {
        CategoryPlot plot = graph.showChart().getCategoryPlot();
        plot.getDomainAxis().setLabel("Estado Civil");
        plot.getRangeAxis().setLabel("Quantidade");
        return super.showChart();
    }

    @Override
    public IGraph reverseDecorator() {
        graph.showChart().getCategoryPlot().getDomainAxis().setLabel(null);
        graph.showChart().getCategoryPlot().getRangeAxis().setLabel(null);
        return graph;
    }

}
