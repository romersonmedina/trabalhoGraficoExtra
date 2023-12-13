package BarraBuilder;

import Builder.GraphBuilder;
import Service.ProcessaDadosService;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

public class HorizontalBarsGraphBuilder extends GraphBuilder {

    ProcessaDadosService dps= new ProcessaDadosService();
    
    @Override
    public void doFactoryChart() {
        DefaultCategoryDataset bars = new DefaultCategoryDataset();

        bars.addValue(chart.getData().get(dps.getMASCULINO()+ dps.getSOLTEIRO()), dps.getMASCULINO(),dps.getSOLTEIRO());
        bars.addValue(chart.getData().get(dps.getFEMININO()+ dps.getSOLTEIRO()), dps.getFEMININO(),dps.getSOLTEIRO());
        bars.addValue(chart.getData().get(dps.getMASCULINO()+ dps.getCASADO()), dps.getMASCULINO(),dps.getCASADO());
        bars.addValue(chart.getData().get(dps.getFEMININO()+ dps.getCASADO()), dps.getFEMININO(),dps.getCASADO());

        chart.setChart(ChartFactory.createBarChart(null,null,null,bars, PlotOrientation.HORIZONTAL,false,false,false));
        CategoryPlot plot = chart.showChart().getCategoryPlot();

        BarRenderer r =(BarRenderer) chart.showChart().getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.CYAN);
        r.setSeriesPaint(1, Color.CYAN);
        r.setBarPainter(new StandardBarPainter());

        plot.getDomainAxis().setVisible(true);
        plot.setDomainGridlinesVisible(false);
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        plot.setRangeGridlinesVisible(false);
        plot.getRangeAxis().setVisible(true);
    }

    @Override
    public String toString() {
        return "Horizontal";
    }
}
