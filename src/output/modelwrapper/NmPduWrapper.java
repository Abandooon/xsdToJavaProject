package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class NmPduWrapper {

    
    private NmPdu nmPdu;

    public NmPduWrapper(NmPdu nmPdu) {
        this.nmPdu = nmPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nmPdu.getS())) {
            
            return nmPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nmPdu.getT())) {
            
            return nmPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(nmPdu.getUuid())) {
            
            return nmPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(nmPdu.getShortName())) {
            
            return new IdentifierWrapper(nmPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(nmPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = nmPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(nmPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(nmPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(nmPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(nmPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(nmPdu.getCategory())) {
            
            return new CategoryStringWrapper(nmPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(nmPdu.getAdminData())) {
            
            return new AdminDataWrapper(nmPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(nmPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(nmPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(nmPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = nmPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(nmPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(nmPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(nmPdu.getLength())) {
            
            return new IntegerWrapper(nmPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(nmPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(nmPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalToIPduMappingWrapper> getISignalToIPduMappings() {
        
        if (CollUtil.isNotEmpty(nmPdu.getISignalToIPduMappings())) {
            ArrayList<ISignalToIPduMapping> originalList = nmPdu.getISignalToIPduMappings();
            ArrayList<ISignalToIPduMappingWrapper> wrapperList = (ArrayList<ISignalToIPduMappingWrapper>)originalList.stream()
                .map(item -> new ISignalToIPduMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmDataInformation() {
        
        if (CollUtil.isNotEmpty(nmPdu.getNmDataInformation())) {
            
            return new BooleanWrapper(nmPdu.getNmDataInformation());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmVoteInformation() {
        
        if (CollUtil.isNotEmpty(nmPdu.getNmVoteInformation())) {
            
            return new BooleanWrapper(nmPdu.getNmVoteInformation());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getUnusedBitPattern() {
        
        if (CollUtil.isNotEmpty(nmPdu.getUnusedBitPattern())) {
            
            return new IntegerWrapper(nmPdu.getUnusedBitPattern());
            
        } else {
            return null;
        }
        
    }




    


    
}