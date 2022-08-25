<?php

interface Search
{
    public function all();
}

class User implements Search
{
    public function all()
    {
        return "Obteniendo a los Usuarios";
    }
}

class Post implements Search
{
    public function all()
    {
        return "Obteniendo a los Post";
    }
}

$user = new User();
echo $user->all();

$post = new Post();
echo $post->all();