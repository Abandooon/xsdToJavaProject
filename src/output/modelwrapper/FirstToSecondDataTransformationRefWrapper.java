package stdgui.data.model.modelwrapper;


    
    


     

public class FirstToSecondDataTransformationRefWrapper {

    
    
    private FirstToSecondDataTransformationRef firstToSecondDataTransformationRef;

    public FirstToSecondDataTransformationRefWrapper(FirstToSecondDataTransformationRef firstToSecondDataTransformationRef) {
        this.firstToSecondDataTransformationRef = firstToSecondDataTransformationRef;
    }

   
    public DataTransformationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(firstToSecondDataTransformationRef.getDest())) {
            
            return firstToSecondDataTransformationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFirstToSecondDataTransformationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = firstToSecondDataTransformationRef.getValue();
        java.lang.String type = firstToSecondDataTransformationRef.getDest().toString().replace("_", "-");
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

    
    public DataTransformationWrapper getDataTransformation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = firstToSecondDataTransformationRef.getValue();
        java.lang.String type = firstToSecondDataTransformationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataTransformation){
            return new DataTransformationWrapper((DataTransformation) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}