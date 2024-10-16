package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventBswModeDeclarationTypeEnumWrapper {

    
    private TdEventBswModeDeclarationTypeEnum tdEventBswModeDeclarationTypeEnum;

    public TdEventBswModeDeclarationTypeEnumWrapper(TdEventBswModeDeclarationTypeEnum tdEventBswModeDeclarationTypeEnum) {
        this.tdEventBswModeDeclarationTypeEnum = tdEventBswModeDeclarationTypeEnum;
    }

   
    public TdEventBswModeDeclarationTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclarationTypeEnum.getValue())) {
            
            return tdEventBswModeDeclarationTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclarationTypeEnum.getS())) {
            
            return tdEventBswModeDeclarationTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclarationTypeEnum.getT())) {
            
            return tdEventBswModeDeclarationTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}