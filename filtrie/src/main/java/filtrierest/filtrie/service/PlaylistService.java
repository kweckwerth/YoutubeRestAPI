package filtrierest.filtrie.service;


import filtrierest.filtrie.model.PlaylistAggregate;

public interface PlaylistService {
    PlaylistAggregate getPlayList(Long userId);
}
