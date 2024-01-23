import SwiftUI
import AVKit

@available(iOS 14.0, *)
struct VideoView: View {
    @EnvironmentObject var viewModel: VideoViewModel
    @State private var player: AVPlayer?
    @State private var isPlaying: Bool = false
    @State private var key: UUID = UUID()
    
    var body: some View {
        VStack {
            if let player = player {
                VideoPlayer(player: player)
                    .frame(width: 320, height: 180, alignment: .center)
                    .id(key)
            }
            
            Button {
                if isPlaying {
                    player?.pause()
                } else {
                    if let player = player {
                        player.seek(to: .zero)  
                        player.play()
                    }
                }
                isPlaying.toggle()
            } label: {
                Image(systemName: isPlaying ? "pause" : "play")
                    .padding()
            }
        }
        .onAppear {
            self.setupPlayer(viewModel.url)
        }
        .onReceive(viewModel.$url, perform: { newURL in
            self.resetPlayer()
            self.setupPlayer(newURL)
        })
    }
    
    private func setupPlayer(_ url: String) {
        if let videoURL = URL(string: url) {
            self.player = AVPlayer(url: videoURL)
            if isPlaying {
                self.player?.play()
            }
        }
    }
    
    private func resetPlayer() {
        player?.pause()
        player = nil
        isPlaying = false
        key = UUID()
    }
}
