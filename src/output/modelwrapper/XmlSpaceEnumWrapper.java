package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class XmlSpaceEnumWrapper {

    
    private XmlSpaceEnum xmlSpaceEnum;

    public XmlSpaceEnumWrapper(XmlSpaceEnum xmlSpaceEnum) {
        this.xmlSpaceEnum = xmlSpaceEnum;
    }

   
    public XmlSpaceEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(xmlSpaceEnum.getValue())) {
            
            return xmlSpaceEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(xmlSpaceEnum.getS())) {
            
            return xmlSpaceEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(xmlSpaceEnum.getT())) {
            
            return xmlSpaceEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}