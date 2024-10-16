package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class PduToFrameMappingWrapper {

    
    private PduToFrameMapping pduToFrameMapping;

    public PduToFrameMappingWrapper(PduToFrameMapping pduToFrameMapping) {
        this.pduToFrameMapping = pduToFrameMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getS())) {
            
            return pduToFrameMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getT())) {
            
            return pduToFrameMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getUuid())) {
            
            return pduToFrameMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getShortName())) {
            
            return new IdentifierWrapper(pduToFrameMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = pduToFrameMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(pduToFrameMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(pduToFrameMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getCategory())) {
            
            return new CategoryStringWrapper(pduToFrameMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getAdminData())) {
            
            return new AdminDataWrapper(pduToFrameMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(pduToFrameMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = pduToFrameMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ByteOrderEnumWrapper getPackingByteOrder() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getPackingByteOrder())) {
            
            return new ByteOrderEnumWrapper(pduToFrameMapping.getPackingByteOrder());
            
        } else {
            return null;
        }
        
    }

    public PduRefWrapper getPduRef() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getPduRef())) {
            
            return new PduRefWrapper(pduToFrameMapping.getPduRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getStartPosition() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getStartPosition())) {
            
            return new IntegerWrapper(pduToFrameMapping.getStartPosition());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getUpdateIndicationBitPosition() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getUpdateIndicationBitPosition())) {
            
            return new IntegerWrapper(pduToFrameMapping.getUpdateIndicationBitPosition());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(pduToFrameMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(pduToFrameMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}