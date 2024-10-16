package stdgui.data.model.modelwrapper;


    
    


     

public class UnitGroupRefWrapper {

    
    
    private UnitGroupRef unitGroupRef;

    public UnitGroupRefWrapper(UnitGroupRef unitGroupRef) {
        this.unitGroupRef = unitGroupRef;
    }

   
    public UnitGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(unitGroupRef.getDest())) {
            
            return unitGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getUnitGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = unitGroupRef.getValue();
        java.lang.String type = unitGroupRef.getDest().toString().replace("_", "-");
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

    
    public UnitGroupWrapper getUnitGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = unitGroupRef.getValue();
        java.lang.String type = unitGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UnitGroup){
            return new UnitGroupWrapper((UnitGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}