package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwComponentDocumentationWrapper {

    
    private SwComponentDocumentation swComponentDocumentation;

    public SwComponentDocumentationWrapper(SwComponentDocumentation swComponentDocumentation) {
        this.swComponentDocumentation = swComponentDocumentation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getS())) {
            
            return swComponentDocumentation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getT())) {
            
            return swComponentDocumentation.getT();
            
        } else {
            return null;
        }
        
    }

    public ChapterWrapper getSwFeatureDef() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getSwFeatureDef())) {
            
            return new ChapterWrapper(swComponentDocumentation.getSwFeatureDef());
            
        } else {
            return null;
        }
        
    }

    public ChapterWrapper getSwFeatureDesc() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getSwFeatureDesc())) {
            
            return new ChapterWrapper(swComponentDocumentation.getSwFeatureDesc());
            
        } else {
            return null;
        }
        
    }

    public ChapterWrapper getSwTestDesc() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getSwTestDesc())) {
            
            return new ChapterWrapper(swComponentDocumentation.getSwTestDesc());
            
        } else {
            return null;
        }
        
    }

    public ChapterWrapper getSwCalibrationNotes() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getSwCalibrationNotes())) {
            
            return new ChapterWrapper(swComponentDocumentation.getSwCalibrationNotes());
            
        } else {
            return null;
        }
        
    }

    public ChapterWrapper getSwMaintenanceNotes() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getSwMaintenanceNotes())) {
            
            return new ChapterWrapper(swComponentDocumentation.getSwMaintenanceNotes());
            
        } else {
            return null;
        }
        
    }

    public ChapterWrapper getSwDiagnosticsNotes() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getSwDiagnosticsNotes())) {
            
            return new ChapterWrapper(swComponentDocumentation.getSwDiagnosticsNotes());
            
        } else {
            return null;
        }
        
    }

    public ChapterWrapper getSwCarbDoc() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getSwCarbDoc())) {
            
            return new ChapterWrapper(swComponentDocumentation.getSwCarbDoc());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ChapterWrapper> getChapter() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getChapter())) {
            ArrayList<Chapter> originalList = swComponentDocumentation.getChapter();
            ArrayList<ChapterWrapper> wrapperList = (ArrayList<ChapterWrapper>)originalList.stream()
                .map(item -> new ChapterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swComponentDocumentation.getVariationPoint())) {
            
            return new VariationPointWrapper(swComponentDocumentation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}