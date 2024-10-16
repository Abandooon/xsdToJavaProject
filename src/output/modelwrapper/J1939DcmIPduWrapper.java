package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class J1939DcmIPduWrapper {

    
    private J1939DcmIPdu j1939DcmIPdu;

    public J1939DcmIPduWrapper(J1939DcmIPdu j1939DcmIPdu) {
        this.j1939DcmIPdu = j1939DcmIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getS())) {
            
            return j1939DcmIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getT())) {
            
            return j1939DcmIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getUuid())) {
            
            return j1939DcmIPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getShortName())) {
            
            return new IdentifierWrapper(j1939DcmIPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = j1939DcmIPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(j1939DcmIPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(j1939DcmIPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getCategory())) {
            
            return new CategoryStringWrapper(j1939DcmIPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getAdminData())) {
            
            return new AdminDataWrapper(j1939DcmIPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(j1939DcmIPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = j1939DcmIPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(j1939DcmIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getLength())) {
            
            return new IntegerWrapper(j1939DcmIPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(j1939DcmIPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(j1939DcmIPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDiagnosticMessageType() {
        
        if (CollUtil.isNotEmpty(j1939DcmIPdu.getDiagnosticMessageType())) {
            
            return new PositiveIntegerWrapper(j1939DcmIPdu.getDiagnosticMessageType());
            
        } else {
            return null;
        }
        
    }




    


    
}