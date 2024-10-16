package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class DcmIPduWrapper {

    
    private DcmIPdu dcmIPdu;

    public DcmIPduWrapper(DcmIPdu dcmIPdu) {
        this.dcmIPdu = dcmIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getS())) {
            
            return dcmIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getT())) {
            
            return dcmIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getUuid())) {
            
            return dcmIPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getShortName())) {
            
            return new IdentifierWrapper(dcmIPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dcmIPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dcmIPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dcmIPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getCategory())) {
            
            return new CategoryStringWrapper(dcmIPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getAdminData())) {
            
            return new AdminDataWrapper(dcmIPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dcmIPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = dcmIPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(dcmIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getLength())) {
            
            return new IntegerWrapper(dcmIPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(dcmIPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(dcmIPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }

    public DiagPduTypeWrapper getDiagPduType() {
        
        if (CollUtil.isNotEmpty(dcmIPdu.getDiagPduType())) {
            
            return new DiagPduTypeWrapper(dcmIPdu.getDiagPduType());
            
        } else {
            return null;
        }
        
    }




    


    
}