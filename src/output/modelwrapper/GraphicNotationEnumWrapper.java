package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class GraphicNotationEnumWrapper {

    
    private GraphicNotationEnum graphicNotationEnum;

    public GraphicNotationEnumWrapper(GraphicNotationEnum graphicNotationEnum) {
        this.graphicNotationEnum = graphicNotationEnum;
    }

   
    public GraphicNotationEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(graphicNotationEnum.getValue())) {
            
            return graphicNotationEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(graphicNotationEnum.getS())) {
            
            return graphicNotationEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(graphicNotationEnum.getT())) {
            
            return graphicNotationEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}