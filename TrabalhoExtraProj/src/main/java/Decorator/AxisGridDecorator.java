package Decorator;

import Model.IGraph;
import org.jfree.chart.JFreeChart;

public class AxisGridDecorator extends GraphDecorator {

    public AxisGridDecorator(IGraph graph) {
        super(graph);
    }

    @Override
    public JFreeChart showChart() {
        graph.showChart().getCategoryPlot().setDomainGridlinesVisible(true);
        graph.showChart().getCategoryPlot().setRangeGridlinesVisible(true);
        return super.showChart();
    }

    @Override
    public IGraph reverseDecorator() {
        graph.showChart().getCategoryPlot().setDomainGridlinesVisible(false);
        graph.showChart().getCategoryPlot().setRangeGridlinesVisible(false);
        return this.graph;
    }
}
