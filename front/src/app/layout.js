import { Inter } from 'next/font/google'
import { AppRouterCacheProvider } from '@mui/material-nextjs/v14-appRouter'
import { CssBaseline } from '@mui/material'
import './globals.css'
import ReduxProvider from '@/components/redux/ReduxProvicer'

const inter = Inter({ subsets: ['latin'] })

export const metadata = {
  title: 'Create Next App',
  description: 'Generated by create next app',
}

export default function RootLayout({ children }) {
  return (
    <html lang="en">
      <AppRouterCacheProvider>
        <CssBaseline />
        <ReduxProvider>
          <body className={inter.className}>{children}</body>
        </ReduxProvider>
      </AppRouterCacheProvider>
    </html>
  )
}
