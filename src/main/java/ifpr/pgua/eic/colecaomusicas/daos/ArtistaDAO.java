package ifpr.pgua.eic.colecaomusicas.daos;

import com.github.hugoperlin.results.Resultado;

import ifpr.pgua.eic.colecaomusicas.models.Artista;

public interface ArtistaDAO {
    //create
    Resultado criar(Artista artista);

    //read
    Resultado buscarArtistaMusica(int musicaId);
    Resultado listar();
    Resultado getById(int id);

    //update
    Resultado atualizar(int id, Artista novo);

    //delete
    Resultado deletar(int id);

}
