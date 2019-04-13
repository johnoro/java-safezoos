package com.lambdaschool.zoos.repositories;

import com.lambdaschool.zoos.models.Animal;

public interface AnimalRepository extends BaseRepository<Animal> {
  Animal findByType(String type);
}