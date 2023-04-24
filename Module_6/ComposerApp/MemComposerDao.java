package Module_6.ComposerApp;

import java.util.*;


class MemComposerDao implements ComposerDao{

    private List<Composer> composers = new ArrayList<Composer>() ;

    MemComposerDao()
    {
        Composer beethoven = new Composer(1007, "Ludwig Van Beethoven", "Classical");
        Composer bach = new Composer(1008, "Johann Sebastian Bach", "Classical");
        Composer mozart = new Composer(1009, "Wolfgang Amadeus Mozart", "Classical");
        Composer brahms = new Composer(1010, "Johannes Brahms", "Classical");
        Composer haydn = new Composer(1011, "Joseph Haydn", "Classical");

        composers.add(beethoven);
        composers.add(bach);
        composers.add(mozart);
        composers.add(brahms);
        composers.add(haydn);
        
    }

    @Override
    public List<Composer> findAll()
    {
        return composers;

    }

    @Override
    public Composer findBy(Integer key) {
        
        for (int i=composers.size()-1; i >= 0; i--)
        {
            if (composers.get(i).getID() == key)
            {
                return composers.get(i);
            }
            
        }
        return null;
    }

    @Override
    public void insert(Composer entity) {
        composers.add(entity);
    }

   
}
