import getDados from "./getDados.js";

const btnSortear = document.querySelector('.btn-sortear');
const fichaDescricao = document.getElementById('ficha-descricao');

function carregarInfoSerie() {
  getDados(`/series/frases`)
      .then(data => {
        fichaDescricao.innerHTML = `
              <img src="${data.poster}" alt="${data.titulo}" />
              <div>
                  <h2>${data.titulo}</h2>
                  <div class="descricao-texto">
                      <p><i>"${data.frase}"</i></p>
                      <p><b>Citado por:</b> ${data.personagem}</p>
                  </div>
              </div>
          `;
      })
      .catch(error => {
          console.error('Erro ao obter informações da série:', error);
      });
}


window.onload = carregarInfoSerie();
btnSortear.addEventListener('click', carregarInfoSerie);


//teste sem api
// function carregarInfoSerie() {    
//     const data = {
//         titulo: "How I Met Your Mother",
//         frase: "Não importa o que você faça na vida. Não vai ser lendário, a menos que os seus amigos estejam lá para ver",
//         personagem: "Barney",
//         poster: "https://m.media-amazon.com/images/M/MV5BNjg1MDQ5MjQ2N15BMl5BanBnXkFtZTYwNjI5NjA3._V1_SX300.jpg"
//     };

//     fichaDescricao.innerHTML = `
//         <img src="${data.poster}" alt="${data.titulo}" />
//         <div>
//             <h2>${data.titulo}</h2>
//             <div class="descricao-texto">
//                 <p><i>"${data.frase}"</i></p>
//                 <p><b>Citado por:</b> ${data.personagem}</p>
//             </div>
//         </div>
//     `;
// }