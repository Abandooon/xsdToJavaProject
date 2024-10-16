package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ItemLabelPosEnumWrapper {

    
    private ItemLabelPosEnum itemLabelPosEnum;

    public ItemLabelPosEnumWrapper(ItemLabelPosEnum itemLabelPosEnum) {
        this.itemLabelPosEnum = itemLabelPosEnum;
    }

   
    public ItemLabelPosEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(itemLabelPosEnum.getValue())) {
            
            return itemLabelPosEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(itemLabelPosEnum.getS())) {
            
            return itemLabelPosEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(itemLabelPosEnum.getT())) {
            
            return itemLabelPosEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}