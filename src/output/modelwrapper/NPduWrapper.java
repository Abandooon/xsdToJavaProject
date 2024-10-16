package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    


public class NPduWrapper {

    
    private NPdu nPdu;

    public NPduWrapper(NPdu nPdu) {
        this.nPdu = nPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nPdu.getS())) {
            
            return nPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nPdu.getT())) {
            
            return nPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(nPdu.getUuid())) {
            
            return nPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(nPdu.getShortName())) {
            
            return new IdentifierWrapper(nPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(nPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = nPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(nPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(nPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(nPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(nPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(nPdu.getCategory())) {
            
            return new CategoryStringWrapper(nPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(nPdu.getAdminData())) {
            
            return new AdminDataWrapper(nPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(nPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(nPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(nPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = nPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(nPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(nPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(nPdu.getLength())) {
            
            return new IntegerWrapper(nPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(nPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(nPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(nPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(nPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }




    


    
}