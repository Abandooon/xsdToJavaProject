package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class GraphicFitEnumWrapper {

    
    private GraphicFitEnum graphicFitEnum;

    public GraphicFitEnumWrapper(GraphicFitEnum graphicFitEnum) {
        this.graphicFitEnum = graphicFitEnum;
    }

   
    public GraphicFitEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(graphicFitEnum.getValue())) {
            
            return graphicFitEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(graphicFitEnum.getS())) {
            
            return graphicFitEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(graphicFitEnum.getT())) {
            
            return graphicFitEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}