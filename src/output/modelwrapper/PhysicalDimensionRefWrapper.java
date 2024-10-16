package stdgui.data.model.modelwrapper;


    
    


     

public class PhysicalDimensionRefWrapper {

    
    
    private PhysicalDimensionRef physicalDimensionRef;

    public PhysicalDimensionRefWrapper(PhysicalDimensionRef physicalDimensionRef) {
        this.physicalDimensionRef = physicalDimensionRef;
    }

   
    public PhysicalDimensionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(physicalDimensionRef.getDest())) {
            
            return physicalDimensionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPhysicalDimensionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = physicalDimensionRef.getValue();
        java.lang.String type = physicalDimensionRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = physicalDimensionRef.getValue();
        java.lang.String type = physicalDimensionRef.getDest().toString().replace("_", "-");
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