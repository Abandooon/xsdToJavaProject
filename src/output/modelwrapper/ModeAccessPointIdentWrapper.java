package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class ModeAccessPointIdentWrapper {

    
    private ModeAccessPointIdent modeAccessPointIdent;

    public ModeAccessPointIdentWrapper(ModeAccessPointIdent modeAccessPointIdent) {
        this.modeAccessPointIdent = modeAccessPointIdent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getS())) {
            
            return modeAccessPointIdent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getT())) {
            
            return modeAccessPointIdent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getUuid())) {
            
            return modeAccessPointIdent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getShortName())) {
            
            return new IdentifierWrapper(modeAccessPointIdent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = modeAccessPointIdent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(modeAccessPointIdent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modeAccessPointIdent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getCategory())) {
            
            return new CategoryStringWrapper(modeAccessPointIdent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getAdminData())) {
            
            return new AdminDataWrapper(modeAccessPointIdent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(modeAccessPointIdent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(modeAccessPointIdent.getAnnotations())) {
            ArrayList<Annotation> originalList = modeAccessPointIdent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}