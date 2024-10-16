package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ContainedIPduCollectionSemanticsEnumWrapper {

    
    private ContainedIPduCollectionSemanticsEnum containedIPduCollectionSemanticsEnum;

    public ContainedIPduCollectionSemanticsEnumWrapper(ContainedIPduCollectionSemanticsEnum containedIPduCollectionSemanticsEnum) {
        this.containedIPduCollectionSemanticsEnum = containedIPduCollectionSemanticsEnum;
    }

   
    public ContainedIPduCollectionSemanticsEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(containedIPduCollectionSemanticsEnum.getValue())) {
            
            return containedIPduCollectionSemanticsEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(containedIPduCollectionSemanticsEnum.getS())) {
            
            return containedIPduCollectionSemanticsEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(containedIPduCollectionSemanticsEnum.getT())) {
            
            return containedIPduCollectionSemanticsEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}