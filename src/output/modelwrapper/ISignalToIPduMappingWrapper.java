package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class ISignalToIPduMappingWrapper {

    
    private ISignalToIPduMapping iSignalToIPduMapping;

    public ISignalToIPduMappingWrapper(ISignalToIPduMapping iSignalToIPduMapping) {
        this.iSignalToIPduMapping = iSignalToIPduMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getS())) {
            
            return iSignalToIPduMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getT())) {
            
            return iSignalToIPduMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getUuid())) {
            
            return iSignalToIPduMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getShortName())) {
            
            return new IdentifierWrapper(iSignalToIPduMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = iSignalToIPduMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(iSignalToIPduMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(iSignalToIPduMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getCategory())) {
            
            return new CategoryStringWrapper(iSignalToIPduMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getAdminData())) {
            
            return new AdminDataWrapper(iSignalToIPduMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iSignalToIPduMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = iSignalToIPduMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ISignalGroupRefWrapper getISignalGroupRef() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getISignalGroupRef())) {
            
            return new ISignalGroupRefWrapper(iSignalToIPduMapping.getISignalGroupRef());
            
        } else {
            return null;
        }
        
    }

    public ISignalRefWrapper getISignalRef() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getISignalRef())) {
            
            return new ISignalRefWrapper(iSignalToIPduMapping.getISignalRef());
            
        } else {
            return null;
        }
        
    }

    public ByteOrderEnumWrapper getPackingByteOrder() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getPackingByteOrder())) {
            
            return new ByteOrderEnumWrapper(iSignalToIPduMapping.getPackingByteOrder());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getStartPosition() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getStartPosition())) {
            
            return new IntegerWrapper(iSignalToIPduMapping.getStartPosition());
            
        } else {
            return null;
        }
        
    }

    public TransferPropertyEnumWrapper getTransferProperty() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getTransferProperty())) {
            
            return new TransferPropertyEnumWrapper(iSignalToIPduMapping.getTransferProperty());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getUpdateIndicationBitPosition() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getUpdateIndicationBitPosition())) {
            
            return new IntegerWrapper(iSignalToIPduMapping.getUpdateIndicationBitPosition());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignalToIPduMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignalToIPduMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}