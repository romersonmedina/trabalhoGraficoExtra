package Decorator;

import Model.IGraph;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.renderer.category.BarPainter;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.general.Dataset;
import java.awt.*;

public class ColoredBarsDecorator extends GraphDecorator {

    public ColoredBarsDecorator(IGraph graph) {
        super(graph);
    }

    @Override
    public JFreeChart showChart() {
        BarRenderer r = (BarRenderer) graph.showChart().getCategoryPlot().getRenderer();
        BarPainter br = r.getBarPainter();
        Dataset bars = graph.showChart().getCategoryPlot().getDataset();

        r.setSeriesPaint(2, Color.white);
        return super.showChart();
    }

    @Override
    public IGraph reverseDecorator() {
        return graph;
    }

}
