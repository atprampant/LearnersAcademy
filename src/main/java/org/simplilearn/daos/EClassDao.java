package org.simplilearn.daos;

import org.simplilearn.entities.EClass;

public interface EClassDao {
    void saveClass(EClass eclass);
    EClass getClass(int cid);
}
