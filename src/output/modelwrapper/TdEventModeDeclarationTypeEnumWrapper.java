package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventModeDeclarationTypeEnumWrapper {

    
    private TdEventModeDeclarationTypeEnum tdEventModeDeclarationTypeEnum;

    public TdEventModeDeclarationTypeEnumWrapper(TdEventModeDeclarationTypeEnum tdEventModeDeclarationTypeEnum) {
        this.tdEventModeDeclarationTypeEnum = tdEventModeDeclarationTypeEnum;
    }

   
    public TdEventModeDeclarationTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclarationTypeEnum.getValue())) {
            
            return tdEventModeDeclarationTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclarationTypeEnum.getS())) {
            
            return tdEventModeDeclarationTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclarationTypeEnum.getT())) {
            
            return tdEventModeDeclarationTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}