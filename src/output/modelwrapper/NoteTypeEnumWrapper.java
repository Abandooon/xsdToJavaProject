package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NoteTypeEnumWrapper {

    
    private NoteTypeEnum noteTypeEnum;

    public NoteTypeEnumWrapper(NoteTypeEnum noteTypeEnum) {
        this.noteTypeEnum = noteTypeEnum;
    }

   
    public NoteTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(noteTypeEnum.getValue())) {
            
            return noteTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(noteTypeEnum.getS())) {
            
            return noteTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(noteTypeEnum.getT())) {
            
            return noteTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}