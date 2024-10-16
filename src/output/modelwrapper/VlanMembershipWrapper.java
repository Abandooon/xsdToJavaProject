package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class VlanMembershipWrapper {

    
    private VlanMembership vlanMembership;

    public VlanMembershipWrapper(VlanMembership vlanMembership) {
        this.vlanMembership = vlanMembership;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(vlanMembership.getS())) {
            
            return vlanMembership.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(vlanMembership.getT())) {
            
            return vlanMembership.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDefaultPriority() {
        
        if (CollUtil.isNotEmpty(vlanMembership.getDefaultPriority())) {
            
            return new PositiveIntegerWrapper(vlanMembership.getDefaultPriority());
            
        } else {
            return null;
        }
        
    }

    public DhcpServerConfigurationWrapper getDhcpAddressAssignment() {
        
        if (CollUtil.isNotEmpty(vlanMembership.getDhcpAddressAssignment())) {
            
            return new DhcpServerConfigurationWrapper(vlanMembership.getDhcpAddressAssignment());
            
        } else {
            return null;
        }
        
    }

    public EthernetSwitchVlanEgressTaggingEnumWrapper getSendActivity() {
        
        if (CollUtil.isNotEmpty(vlanMembership.getSendActivity())) {
            
            return new EthernetSwitchVlanEgressTaggingEnumWrapper(vlanMembership.getSendActivity());
            
        } else {
            return null;
        }
        
    }

    public VlanRefWrapper getVlanRef() {
        
        if (CollUtil.isNotEmpty(vlanMembership.getVlanRef())) {
            
            return new VlanRefWrapper(vlanMembership.getVlanRef());
            
        } else {
            return null;
        }
        
    }




    


    
}