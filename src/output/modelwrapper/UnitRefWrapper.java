package stdgui.data.model.modelwrapper;


    
    


     

public class UnitRefWrapper {

    
    
    private UnitRef unitRef;

    public UnitRefWrapper(UnitRef unitRef) {
        this.unitRef = unitRef;
    }

   
    public UnitSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(unitRef.getDest())) {
            
            return unitRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getUnitRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = unitRef.getValue();
        java.lang.String type = unitRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        java.lang.String className = schemaController.convertClassName(type);
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        java.lang.String wrapperClassName = "" + className + "Wrapper";
        Class<?> wrapperClass = Class.forName(wrapperClassName);
        Constructor<?> wrapperConstructor = wrapperClass.getConstructor(queryObject.getClass());
        Object wrapperInstance = wrapperConstructor.newInstance(queryObject);
        return wrapperInstance;
    }

    
    public UnitWrapper getUnit() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = unitRef.getValue();
        java.lang.String type = unitRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Unit){
            return new UnitWrapper((Unit) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}