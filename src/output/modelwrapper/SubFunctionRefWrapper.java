package stdgui.data.model.modelwrapper;


    
    


     

public class SubFunctionRefWrapper {

    
    
    private SubFunctionRef subFunctionRef;

    public SubFunctionRefWrapper(SubFunctionRef subFunctionRef) {
        this.subFunctionRef = subFunctionRef;
    }

   
    public McFunctionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(subFunctionRef.getDest())) {
            
            return subFunctionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSubFunctionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = subFunctionRef.getValue();
        java.lang.String type = subFunctionRef.getDest().toString().replace("_", "-");
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

    
    public McFunctionWrapper getMcFunction() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = subFunctionRef.getValue();
        java.lang.String type = subFunctionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof McFunction){
            return new McFunctionWrapper((McFunction) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}