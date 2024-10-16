package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class CouplingPortTrafficClassAssignmentWrapper {

    
    private CouplingPortTrafficClassAssignment couplingPortTrafficClassAssignment;

    public CouplingPortTrafficClassAssignmentWrapper(CouplingPortTrafficClassAssignment couplingPortTrafficClassAssignment) {
        this.couplingPortTrafficClassAssignment = couplingPortTrafficClassAssignment;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(couplingPortTrafficClassAssignment.getS())) {
            
            return couplingPortTrafficClassAssignment.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(couplingPortTrafficClassAssignment.getT())) {
            
            return couplingPortTrafficClassAssignment.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(couplingPortTrafficClassAssignment.getShortName())) {
            
            return new IdentifierWrapper(couplingPortTrafficClassAssignment.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(couplingPortTrafficClassAssignment.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = couplingPortTrafficClassAssignment.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PositiveIntegerWrapper> getPrioritys() {
        
        if (CollUtil.isNotEmpty(couplingPortTrafficClassAssignment.getPrioritys())) {
            ArrayList<PositiveInteger> originalList = couplingPortTrafficClassAssignment.getPrioritys();
            ArrayList<PositiveIntegerWrapper> wrapperList = (ArrayList<PositiveIntegerWrapper>)originalList.stream()
                .map(item -> new PositiveIntegerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTrafficClass() {
        
        if (CollUtil.isNotEmpty(couplingPortTrafficClassAssignment.getTrafficClass())) {
            
            return new PositiveIntegerWrapper(couplingPortTrafficClassAssignment.getTrafficClass());
            
        } else {
            return null;
        }
        
    }




    


    
}