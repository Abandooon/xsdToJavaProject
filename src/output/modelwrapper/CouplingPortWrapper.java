package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class CouplingPortWrapper {

    
    private CouplingPort couplingPort;

    public CouplingPortWrapper(CouplingPort couplingPort) {
        this.couplingPort = couplingPort;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(couplingPort.getS())) {
            
            return couplingPort.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(couplingPort.getT())) {
            
            return couplingPort.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(couplingPort.getUuid())) {
            
            return couplingPort.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(couplingPort.getShortName())) {
            
            return new IdentifierWrapper(couplingPort.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(couplingPort.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = couplingPort.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(couplingPort.getLongName())) {
            
            return new MultilanguageLongNameWrapper(couplingPort.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(couplingPort.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(couplingPort.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(couplingPort.getCategory())) {
            
            return new CategoryStringWrapper(couplingPort.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(couplingPort.getAdminData())) {
            
            return new AdminDataWrapper(couplingPort.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(couplingPort.getIntroduction())) {
            
            return new DocumentationBlockWrapper(couplingPort.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(couplingPort.getAnnotations())) {
            ArrayList<Annotation> originalList = couplingPort.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EthernetConnectionNegotiationEnumWrapper getConnectionNegotiationBehavior() {
        
        if (CollUtil.isNotEmpty(couplingPort.getConnectionNegotiationBehavior())) {
            
            return new EthernetConnectionNegotiationEnumWrapper(couplingPort.getConnectionNegotiationBehavior());
            
        } else {
            return null;
        }
        
    }

    public CouplingPortDetailsWrapper getCouplingPortDetails() {
        
        if (CollUtil.isNotEmpty(couplingPort.getCouplingPortDetails())) {
            
            return new CouplingPortDetailsWrapper(couplingPort.getCouplingPortDetails());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getCouplingPortSpeed() {
        
        if (CollUtil.isNotEmpty(couplingPort.getCouplingPortSpeed())) {
            
            return new PositiveIntegerWrapper(couplingPort.getCouplingPortSpeed());
            
        } else {
            return null;
        }
        
    }

    public DefaultVlanRefWrapper getDefaultVlanRef() {
        
        if (CollUtil.isNotEmpty(couplingPort.getDefaultVlanRef())) {
            
            return new DefaultVlanRefWrapper(couplingPort.getDefaultVlanRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MacMulticastAddressRefWrapper> getMacMulticastAddressRefs() {
        
        if (CollUtil.isNotEmpty(couplingPort.getMacMulticastAddressRefs())) {
            ArrayList<MacMulticastAddressRef> originalList = couplingPort.getMacMulticastAddressRefs();
            ArrayList<MacMulticastAddressRefWrapper> wrapperList = (ArrayList<MacMulticastAddressRefWrapper>)originalList.stream()
                .map(item -> new MacMulticastAddressRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EthernetPhysicalLayerTypeEnumWrapper getPhysicalLayerType() {
        
        if (CollUtil.isNotEmpty(couplingPort.getPhysicalLayerType())) {
            
            return new EthernetPhysicalLayerTypeEnumWrapper(couplingPort.getPhysicalLayerType());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VlanMembershipWrapper> getVlanMemberships() {
        
        if (CollUtil.isNotEmpty(couplingPort.getVlanMemberships())) {
            ArrayList<VlanMembership> originalList = couplingPort.getVlanMemberships();
            ArrayList<VlanMembershipWrapper> wrapperList = (ArrayList<VlanMembershipWrapper>)originalList.stream()
                .map(item -> new VlanMembershipWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VlanModifierRefWrapper getVlanModifierRef() {
        
        if (CollUtil.isNotEmpty(couplingPort.getVlanModifierRef())) {
            
            return new VlanModifierRefWrapper(couplingPort.getVlanModifierRef());
            
        } else {
            return null;
        }
        
    }




    


    
}