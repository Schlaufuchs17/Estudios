document.addEventListener("DOMContentLoaded", function () { //Espera a que este cargado el html para comenzar
    const songList = document.querySelectorAll(".playlist > ul > li.song");
    const audioPlayersContainer = document.querySelector(".audio-players");

    songList.forEach((song, index) => { //Crea un audio por cada cancion
        const audioPlayer = document.createElement("audio");
        audioPlayer.controls = true;
        audioPlayer.src = song.getAttribute("data-src");

        //Creamos una imagen para cada cancion,añadiendo una si no encuentra
        const image = document.createElement("img");
        const imgSrc = song.getAttribute("data-img");
        if (imgSrc) {
            image.src = imgSrc;
        } else {
            image.src = "Imagenes/simbolo.png";
        }

        //Contenedor para el reproductor
        const playerContainer = document.createElement("div");
        playerContainer.classList.add("audio-player");
        playerContainer.appendChild(image);
        playerContainer.appendChild(audioPlayer);

        //Agregamos el reproductor a la lista de reproduccion
        audioPlayersContainer.appendChild(playerContainer);

        //Agregamos un evento a cada cancion para reproducirla
        song.addEventListener("click", function () {
            //Pausamos el resto de reproductores mintras suena uno para que no se superpongan
            audioPlayersContainer.querySelectorAll("audio").forEach((player, i) => {
                if (i !== index) {
                    player.pause();
                }
            });

            audioPlayer.play(); //Reproduce la cancion
        });
    });
});
