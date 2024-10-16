package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TdEventIPduWrapper {

    
    private TdEventIPdu tdEventIPdu;

    public TdEventIPduWrapper(TdEventIPdu tdEventIPdu) {
        this.tdEventIPdu = tdEventIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getS())) {
            
            return tdEventIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getT())) {
            
            return tdEventIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getUuid())) {
            
            return tdEventIPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getShortName())) {
            
            return new IdentifierWrapper(tdEventIPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventIPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventIPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventIPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getCategory())) {
            
            return new CategoryStringWrapper(tdEventIPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getAdminData())) {
            
            return new AdminDataWrapper(tdEventIPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventIPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventIPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventIPdu.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(tdEventIPdu.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public IPduRef_TdEventIPduWrapper getIPduRef() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getIPduRef())) {
            
            return new IPduRef_TdEventIPduWrapper(tdEventIPdu.getIPduRef());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelRefWrapper getPhysicalChannelRef() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getPhysicalChannelRef())) {
            
            return new PhysicalChannelRefWrapper(tdEventIPdu.getPhysicalChannelRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventIPduTypeEnumWrapper getTdEventType() {
        
        if (CollUtil.isNotEmpty(tdEventIPdu.getTdEventType())) {
            
            return new TdEventIPduTypeEnumWrapper(tdEventIPdu.getTdEventType());
            
        } else {
            return null;
        }
        
    }




    


    
}