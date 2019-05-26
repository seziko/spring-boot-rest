package com.bilgeadam.example.springbootrest.service;

import com.bilgeadam.example.springbootrest.dao.KategoriDAO;
import com.bilgeadam.example.springbootrest.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class KategoriServiceImpl implements KategoriService{

    private final KategoriDAO kategoriDAO;

    @Autowired
    public KategoriServiceImpl(KategoriDAO kategoriDAO) {
        this.kategoriDAO = kategoriDAO;
    }


    @Transactional
    @Override
    public Kategori kaydet(Kategori kategori) {
        if (kategori==null){
            return kategori;

        }
        return kategoriDAO.save(kategori);
    }

    @Transactional
    @Override
    public Kategori guncelle(Kategori kategori) {
        if (kategori==null||kategori.getId()==null){
            return kategori;
        }

        return kategoriDAO.save(kategori);
    }

    @Transactional
    @Override
    public void sil(Kategori kategori) {

        if (kategori.getId()!=null){
            kategoriDAO.delete(kategori);
        }

    }

    @Transactional
    @Override
    public void silById(Long kategoriId) {

        if (kategoriId!=null){
            kategoriDAO.deleteById(kategoriId);
        }
    }

    @Transactional
    @Override
    public List<Kategori> findAll() {
        return null;
    }

    @Transactional
    @Override

    public Kategori findById(Long kategoriId) {
        if (kategoriId!=null){
            return kategoriDAO.findById(kategoriId).get();
        }
        return null;
    }
}
