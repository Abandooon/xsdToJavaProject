package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class MultiplexedIPduWrapper {

    
    private MultiplexedIPdu multiplexedIPdu;

    public MultiplexedIPduWrapper(MultiplexedIPdu multiplexedIPdu) {
        this.multiplexedIPdu = multiplexedIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getS())) {
            
            return multiplexedIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getT())) {
            
            return multiplexedIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getUuid())) {
            
            return multiplexedIPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getShortName())) {
            
            return new IdentifierWrapper(multiplexedIPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = multiplexedIPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(multiplexedIPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(multiplexedIPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getCategory())) {
            
            return new CategoryStringWrapper(multiplexedIPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getAdminData())) {
            
            return new AdminDataWrapper(multiplexedIPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(multiplexedIPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = multiplexedIPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(multiplexedIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getLength())) {
            
            return new IntegerWrapper(multiplexedIPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(multiplexedIPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(multiplexedIPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DynamicPartWrapper> getDynamicParts() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getDynamicParts())) {
            ArrayList<DynamicPart> originalList = multiplexedIPdu.getDynamicParts();
            ArrayList<DynamicPartWrapper> wrapperList = (ArrayList<DynamicPartWrapper>)originalList.stream()
                .map(item -> new DynamicPartWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ByteOrderEnumWrapper getSelectorFieldByteOrder() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getSelectorFieldByteOrder())) {
            
            return new ByteOrderEnumWrapper(multiplexedIPdu.getSelectorFieldByteOrder());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSelectorFieldLength() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getSelectorFieldLength())) {
            
            return new IntegerWrapper(multiplexedIPdu.getSelectorFieldLength());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSelectorFieldStartPosition() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getSelectorFieldStartPosition())) {
            
            return new IntegerWrapper(multiplexedIPdu.getSelectorFieldStartPosition());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<StaticPartWrapper> getStaticParts() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getStaticParts())) {
            ArrayList<StaticPart> originalList = multiplexedIPdu.getStaticParts();
            ArrayList<StaticPartWrapper> wrapperList = (ArrayList<StaticPartWrapper>)originalList.stream()
                .map(item -> new StaticPartWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TriggerModeWrapper getTriggerMode() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getTriggerMode())) {
            
            return new TriggerModeWrapper(multiplexedIPdu.getTriggerMode());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getUnusedBitPattern() {
        
        if (CollUtil.isNotEmpty(multiplexedIPdu.getUnusedBitPattern())) {
            
            return new IntegerWrapper(multiplexedIPdu.getUnusedBitPattern());
            
        } else {
            return null;
        }
        
    }




    


    
}