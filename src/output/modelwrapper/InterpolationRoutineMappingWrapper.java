package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class InterpolationRoutineMappingWrapper {

    
    private InterpolationRoutineMapping interpolationRoutineMapping;

    public InterpolationRoutineMappingWrapper(InterpolationRoutineMapping interpolationRoutineMapping) {
        this.interpolationRoutineMapping = interpolationRoutineMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMapping.getS())) {
            
            return interpolationRoutineMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMapping.getT())) {
            
            return interpolationRoutineMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<InterpolationRoutineWrapper> getInterpolationRoutines() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMapping.getInterpolationRoutines())) {
            ArrayList<InterpolationRoutine> originalList = interpolationRoutineMapping.getInterpolationRoutines();
            ArrayList<InterpolationRoutineWrapper> wrapperList = (ArrayList<InterpolationRoutineWrapper>)originalList.stream()
                .map(item -> new InterpolationRoutineWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwRecordLayoutRefWrapper getSwRecordLayoutRef() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMapping.getSwRecordLayoutRef())) {
            
            return new SwRecordLayoutRefWrapper(interpolationRoutineMapping.getSwRecordLayoutRef());
            
        } else {
            return null;
        }
        
    }




    


    
}