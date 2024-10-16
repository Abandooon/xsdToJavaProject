package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    


public class XcpPduWrapper {

    
    private XcpPdu xcpPdu;

    public XcpPduWrapper(XcpPdu xcpPdu) {
        this.xcpPdu = xcpPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getS())) {
            
            return xcpPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getT())) {
            
            return xcpPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getUuid())) {
            
            return xcpPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getShortName())) {
            
            return new IdentifierWrapper(xcpPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = xcpPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(xcpPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(xcpPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getCategory())) {
            
            return new CategoryStringWrapper(xcpPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getAdminData())) {
            
            return new AdminDataWrapper(xcpPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(xcpPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = xcpPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(xcpPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getLength())) {
            
            return new IntegerWrapper(xcpPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(xcpPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(xcpPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(xcpPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }




    


    
}