package stdgui.data.model.modelwrapper;


    
    


     

public class FirstPhysicalDimensionRefWrapper {

    
    
    private FirstPhysicalDimensionRef firstPhysicalDimensionRef;

    public FirstPhysicalDimensionRefWrapper(FirstPhysicalDimensionRef firstPhysicalDimensionRef) {
        this.firstPhysicalDimensionRef = firstPhysicalDimensionRef;
    }

   
    public PhysicalDimensionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(firstPhysicalDimensionRef.getDest())) {
            
            return firstPhysicalDimensionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFirstPhysicalDimensionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = firstPhysicalDimensionRef.getValue();
        java.lang.String type = firstPhysicalDimensionRef.getDest().toString().replace("_", "-");
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

    
    public PhysicalDimensionWrapper getPhysicalDimension() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = firstPhysicalDimensionRef.getValue();
        java.lang.String type = firstPhysicalDimensionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PhysicalDimension){
            return new PhysicalDimensionWrapper((PhysicalDimension) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}