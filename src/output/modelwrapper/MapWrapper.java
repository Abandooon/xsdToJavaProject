package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Map;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Area;
    


public class MapWrapper {

    
    private Map map;

    public MapWrapper(Map map) {
        this.map = map;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(map.getS())) {
            
            return map.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(map.getT())) {
            
            return map.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getClass1() {
        
        if (CollUtil.isNotEmpty(map.getClass1())) {
            
            return map.getClass1();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getName() {
        
        if (CollUtil.isNotEmpty(map.getName())) {
            
            return map.getName();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOnclick() {
        
        if (CollUtil.isNotEmpty(map.getOnclick())) {
            
            return map.getOnclick();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOndblclick() {
        
        if (CollUtil.isNotEmpty(map.getOndblclick())) {
            
            return map.getOndblclick();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOnkeydown() {
        
        if (CollUtil.isNotEmpty(map.getOnkeydown())) {
            
            return map.getOnkeydown();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOnkeypress() {
        
        if (CollUtil.isNotEmpty(map.getOnkeypress())) {
            
            return map.getOnkeypress();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOnkeyup() {
        
        if (CollUtil.isNotEmpty(map.getOnkeyup())) {
            
            return map.getOnkeyup();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOnmousedown() {
        
        if (CollUtil.isNotEmpty(map.getOnmousedown())) {
            
            return map.getOnmousedown();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOnmousemove() {
        
        if (CollUtil.isNotEmpty(map.getOnmousemove())) {
            
            return map.getOnmousemove();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOnmouseout() {
        
        if (CollUtil.isNotEmpty(map.getOnmouseout())) {
            
            return map.getOnmouseout();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOnmouseover() {
        
        if (CollUtil.isNotEmpty(map.getOnmouseover())) {
            
            return map.getOnmouseover();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getOnmouseup() {
        
        if (CollUtil.isNotEmpty(map.getOnmouseup())) {
            
            return map.getOnmouseup();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getStyle() {
        
        if (CollUtil.isNotEmpty(map.getStyle())) {
            
            return map.getStyle();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getTitle() {
        
        if (CollUtil.isNotEmpty(map.getTitle())) {
            
            return map.getTitle();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AreaWrapper> getArea() {
        
        if (CollUtil.isNotEmpty(map.getArea())) {
            ArrayList<Area> originalList = map.getArea();
            ArrayList<AreaWrapper> wrapperList = (ArrayList<AreaWrapper>)originalList.stream()
                .map(item -> new AreaWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}