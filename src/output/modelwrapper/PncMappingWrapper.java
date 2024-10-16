package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PncMappingWrapper {

    
    private PncMapping pncMapping;

    public PncMappingWrapper(PncMapping pncMapping) {
        this.pncMapping = pncMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pncMapping.getS())) {
            
            return pncMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pncMapping.getT())) {
            
            return pncMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(pncMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(pncMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(pncMapping.getCategory())) {
            
            return new CategoryStringWrapper(pncMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(pncMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(pncMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(pncMapping.getAdminData())) {
            
            return new AdminDataWrapper(pncMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PncGroupRefWrapper> getPncGroupRefs() {
        
        if (CollUtil.isNotEmpty(pncMapping.getPncGroupRefs())) {
            ArrayList<PncGroupRef> originalList = pncMapping.getPncGroupRefs();
            ArrayList<PncGroupRefWrapper> wrapperList = (ArrayList<PncGroupRefWrapper>)originalList.stream()
                .map(item -> new PncGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPncIdentifier() {
        
        if (CollUtil.isNotEmpty(pncMapping.getPncIdentifier())) {
            
            return new PositiveIntegerWrapper(pncMapping.getPncIdentifier());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(pncMapping.getShortLabel())) {
            
            return new IdentifierWrapper(pncMapping.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortGroupInSystemInstanceRefWrapper> getVfcIrefs() {
        
        if (CollUtil.isNotEmpty(pncMapping.getVfcIrefs())) {
            ArrayList<PortGroupInSystemInstanceRef> originalList = pncMapping.getVfcIrefs();
            ArrayList<PortGroupInSystemInstanceRefWrapper> wrapperList = (ArrayList<PortGroupInSystemInstanceRefWrapper>)originalList.stream()
                .map(item -> new PortGroupInSystemInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<WakeupFrameRefWrapper> getWakeupFrameRefs() {
        
        if (CollUtil.isNotEmpty(pncMapping.getWakeupFrameRefs())) {
            ArrayList<WakeupFrameRef> originalList = pncMapping.getWakeupFrameRefs();
            ArrayList<WakeupFrameRefWrapper> wrapperList = (ArrayList<WakeupFrameRefWrapper>)originalList.stream()
                .map(item -> new WakeupFrameRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(pncMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(pncMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}