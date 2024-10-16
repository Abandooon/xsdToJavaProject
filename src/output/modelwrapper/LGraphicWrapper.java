package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Map;
    


public class LGraphicWrapper {

    
    private LGraphic lGraphic;

    public LGraphicWrapper(LGraphic lGraphic) {
        this.lGraphic = lGraphic;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lGraphic.getS())) {
            
            return lGraphic.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lGraphic.getT())) {
            
            return lGraphic.getT();
            
        } else {
            return null;
        }
        
    }

    public LEnumSimple getL() {
        
        if (CollUtil.isNotEmpty(lGraphic.getL())) {
            
            return lGraphic.getL();
            
        } else {
            return null;
        }
        
    }

    public GraphicWrapper getGraphic() {
        
        if (CollUtil.isNotEmpty(lGraphic.getGraphic())) {
            
            return new GraphicWrapper(lGraphic.getGraphic());
            
        } else {
            return null;
        }
        
    }

    public MapWrapper getMap() {
        
        if (CollUtil.isNotEmpty(lGraphic.getMap())) {
            
            return new MapWrapper(lGraphic.getMap());
            
        } else {
            return null;
        }
        
    }




    


    
}