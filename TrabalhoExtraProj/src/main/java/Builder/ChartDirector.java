package Builder;

import Model.IGraph;

public class ChartDirector {

    public IGraph build(GraphBuilder builder, IGraph model) {
        builder.setChart(model);
        builder.doFactoryChart();
        return builder.build();
    }
}
