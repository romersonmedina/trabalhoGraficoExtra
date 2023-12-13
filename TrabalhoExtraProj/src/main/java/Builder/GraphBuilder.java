package Builder;

import Model.IGraph;

public abstract class GraphBuilder {

    protected IGraph chart;

    public abstract void doFactoryChart();

    final IGraph build() {
        return chart;
    }

    protected void setChart(IGraph chart) {
        this.chart = chart;
    }
}
