package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EndToEndTransformationISignalPropsWrapper {

    
    private EndToEndTransformationISignalProps endToEndTransformationISignalProps;

    public EndToEndTransformationISignalPropsWrapper(EndToEndTransformationISignalProps endToEndTransformationISignalProps) {
        this.endToEndTransformationISignalProps = endToEndTransformationISignalProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalProps.getS())) {
            
            return endToEndTransformationISignalProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalProps.getT())) {
            
            return endToEndTransformationISignalProps.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalProps.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(endToEndTransformationISignalProps.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalProps.getCategory())) {
            
            return new CategoryStringWrapper(endToEndTransformationISignalProps.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalProps.getIntroduction())) {
            
            return new DocumentationBlockWrapper(endToEndTransformationISignalProps.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalProps.getAdminData())) {
            
            return new AdminDataWrapper(endToEndTransformationISignalProps.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EndToEndTransformationISignalPropsConditionalWrapper> getEndToEndTransformationISignalPropsVariants() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalProps.getEndToEndTransformationISignalPropsVariants())) {
            ArrayList<EndToEndTransformationISignalPropsConditional> originalList = endToEndTransformationISignalProps.getEndToEndTransformationISignalPropsVariants();
            ArrayList<EndToEndTransformationISignalPropsConditionalWrapper> wrapperList = (ArrayList<EndToEndTransformationISignalPropsConditionalWrapper>)originalList.stream()
                .map(item -> new EndToEndTransformationISignalPropsConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}