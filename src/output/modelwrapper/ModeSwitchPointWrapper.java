package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ModeSwitchPointWrapper {

    
    private ModeSwitchPoint modeSwitchPoint;

    public ModeSwitchPointWrapper(ModeSwitchPoint modeSwitchPoint) {
        this.modeSwitchPoint = modeSwitchPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getS())) {
            
            return modeSwitchPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getT())) {
            
            return modeSwitchPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getUuid())) {
            
            return modeSwitchPoint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getShortName())) {
            
            return new IdentifierWrapper(modeSwitchPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeSwitchPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeSwitchPoint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeSwitchPoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getCategory())) {
            
            return new CategoryStringWrapper(modeSwitchPoint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getAdminData())) {
            
            return new AdminDataWrapper(modeSwitchPoint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeSwitchPoint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getAnnotations())) {
            ArrayList<Annotation> originalList = modeSwitchPoint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PModeGroupInAtomicSwcInstanceRefWrapper getModeGroupIref() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getModeGroupIref())) {
            
            return new PModeGroupInAtomicSwcInstanceRefWrapper(modeSwitchPoint.getModeGroupIref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(modeSwitchPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(modeSwitchPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}